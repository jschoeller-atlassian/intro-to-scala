package intermediatecourse.level08

import intermediatecourse.level08.*
import intermediatecourse.level08.ImplicitExercises.writeGoodDayInRedPen
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.funspec.AnyFunSpec

class ImplicitExercisesTest extends AnyFunSpec with TypeCheckedTripleEquals {

  describe("writeGoodDayInRedPen") {
    it("Writing \"good day\" in red color by pen.") {
      assert(writeGoodDayInRedPen === "Writing good day in red color by pen.")
    }
  }
}
