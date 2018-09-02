package projecttracker

class ListProjectsController {
    //default method for controller
    //calls to index redirect to current
    def index = { 
      redirect (action: current)
    }
    def current = {
      render "Project Tracker Video Tutorial"
    }
    def overdue = {
      render "Order Valintines day package"
    }
}
