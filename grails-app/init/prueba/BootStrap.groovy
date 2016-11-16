package prueba

class BootStrap {

    def init = { servletContext ->
		if (Ship.count() == 0) {
			new Ship(nombre: "Barco 1", capacidad: 100).save();
			new Ship(nombre: "Barco 2", capacidad: 200).save();
			new Ship(nombre: "Barco 3", capacidad: 300).save();
		}
    }
    def destroy = {
    }

}