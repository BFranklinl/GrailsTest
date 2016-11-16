package prueba

class TestController {

    def index() {
		redirect(action: "greeting")
	}
	
	def greeting() {
		render "<h1>Hola!</h1>"
	}
}
