package controllers

import javax.inject._
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import repositories.DataRepository

import scala.concurrent.ExecutionContext

@Singleton
class ApplicationController @Inject()(
  val controllerComponents: ControllerComponents,
  val dataRepository: DataRepository,
  val executionContext: ExecutionContext) extends BaseController {
  def index(): Action[AnyContent] = Action(Ok)

  def create() = TODO

  def read(id: String) = TODO

  def update(id: String) = TODO

  def delete(id: String) = TODO
}