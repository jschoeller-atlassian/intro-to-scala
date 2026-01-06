package intermediatecourse.level08

object ImplicitExercises {

  private case class Color(value: String)
  private case class DrawingDevice(value: String)

/**
  * Implicit parameters are similar to regular method parameters,
  * except they could be passed to a method silently without going through the regular parameters list.
  *
  * A method can define a list of implicit parameters, that is placed after the list of regular parameters.
 * These parameters are indicated using the implicit keyword, and all parameters after the implicit keyword are implicit:
  */

  /**
   * Now, let’s define a write method that takes a String as a regular parameter and the two case classes as implicit parameters
   */
  private def write(text: String)(implicit color: Color, by: DrawingDevice) = {
    s"Writing $text in ${color.value} color by ${by.value}."
  }

    /**
     * To provide the Color and DrawingDevice instances to the write method, we would define the instances as implicit and call the method:
     */
    def writeGoodDayInRedPen: String = {
      implicit val red: Color = ???
      implicit val drawingDevice: DrawingDevice = ???

      // Don't change the following line.
      write("good day")
    }

  /**
   * When Scala matches the implicit values, the parameter and variable names are ignored.
   * Scala will match implicit value by type.
   */
}
