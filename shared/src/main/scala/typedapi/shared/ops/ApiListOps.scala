package typedapi.shared.ops

import typedapi.shared._
import shapeless._

trait ApiListOps {

  def := = EmptyCons

  def transform[H <: HList, Out](apiList: FinalCons[H])
                                (implicit folder: TypeLevelFoldLeft.Aux[H, (HNil, HNil), Out]): TypeLevelFoldLeft.Aux[H, (HNil, HNil), Out] = 
    folder

  def Path[S](wit: Witness.Lt[S]) = PathElement[S](wit)
  def Segment[A] = new SegmentHelper[A]
  def Query[A]   = new QueryHelper[A]
  def Header[A]  = new HeaderHelper[A]
  val RawHeaders = RawHeadersParam
  def ReqBody[A] = ReqBodyElement[A]
  def Get[A] = GetElement[A]
  def Put[A] = PutElement[A]
  def PutWithBody[Bd, A] = PutWithBodyElement[Bd, A]
  def Post[A] = PostElement[A]
  def PostWithBody[Bd, A] = PostWithBodyElement[Bd, A]
  def Delete[A] = DeleteElement[A]
}
