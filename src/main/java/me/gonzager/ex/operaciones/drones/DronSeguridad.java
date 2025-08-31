package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.Misiones.Mision;

public class DronSeguridad extends Dron {

    public DronSeguridad(Integer autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);
    }

    public Boolean esDronAvanzado() {
        return this.getProcesamiento() > 50;
    }
}