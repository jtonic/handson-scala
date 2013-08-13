package wekanban

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.annotations._
import org.squeryl._
import wekanban.KanbanSchema._

/**
 * Created by jtonic on 8/13/13.
 */
class Story(val number: String, val title: String, val phase: String) {

  private[this] def validate = {
    if (number.isEmpty || title.isEmpty) {
      throw new ValidationException("Both number and title are required")
    }
    if (!stories.where(story => story.number === number).isEmpty) {
      throw new ValidationException("The story number is not unique")
    }
  }

  def save(): Either[Throwable, String] = {
    tx {
      try {
        validate
        KanbanSchema.stories.insert(this)
        Right("Story has successfully inserted")
      } catch {
        case ex: Throwable => Left(ex)
      }
    }
  }
}

object Story {
  def apply(number: String, title: String) =
    new Story(number, title, "ready")
}
