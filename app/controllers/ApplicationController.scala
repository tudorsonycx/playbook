package controllers

import javax.inject._
import play.api.mvc.{BaseController, ControllerComponents}

@Singleton
class ApplicationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController