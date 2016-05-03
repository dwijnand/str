import scala.{ Any, AnyVal, StringContext }

package object nonemptystring {
  final implicit class NonEmptyStringContext(val _sc: StringContext) extends AnyVal {
    def nes[A >: Any](args: A*): NonEmptyString = macro NonEmptyStringMacros.nesImpl
  }
}