package prueba

import grails.rest.*

@Resource(uri='/ship')
class Ship {
	String nombre
	int capacidad
	
	static constraints = {
        nombre blank:false
		capacidad blank:false
    }

}
