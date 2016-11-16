package prueba

import grails.transaction.*
import static org.springframework.http.HttpStatus.*
import static org.springframework.http.HttpMethod.*

@Transactional(readOnly = true)
class ShipController {

    def index(Integer max) { 
		params.max = Math.min(max ?: 10, 100)
		def ships = Ship.list(params)
		[ships:ships]
	}
}
