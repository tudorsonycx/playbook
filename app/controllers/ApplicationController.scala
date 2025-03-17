package controllers

import javax.inject._
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

@Singleton
class ApplicationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def index(): Action[AnyContent] = Action(Ok)

  def create() = TODO

  def read(id: String) = TODO

  def update(id: String) = TODO

  def delete(id: String) = TODO
}