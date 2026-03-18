package grupo28_proyecto;

/**
 * Representa el zoológico y administra los animales y recintos registrados.
 * 
 * @author Wilton Rivera
 */
public class Zoologico {

    private int idZoologico;
    private String nombreZoologico;
    private String localidadZoologico;
    private int capacidad;
    private Animal[] animales;
    private Recinto[] recintos;
    private int cantidadAnimales;
    private int cantidadRecintos;

    /**
     * Inicializa el zoológico con sus datos principales y crea los arreglos
     * de animales y recintos según la capacidad indicada.
     */
    public Zoologico(int idZoologico, String nombreZoologico, String localidadZoologico, int capacidad) {
        this.idZoologico = idZoologico;
        this.nombreZoologico = nombreZoologico;
        this.localidadZoologico = localidadZoologico;
        this.capacidad = capacidad;
        this.animales = new Animal[capacidad];
        this.recintos = new Recinto[capacidad];
        this.cantidadAnimales = 0;
        this.cantidadRecintos = 0;
    }

    public int getIdZoologico() {
        return idZoologico;
    }

    public void setIdZoologico(int idZoologico) {
        this.idZoologico = idZoologico;
    }

    public String getNombreZoologico() {
        return nombreZoologico;
    }

    public void setNombreZoologico(String nombreZoologico) {
        this.nombreZoologico = nombreZoologico;
    }

    public String getLocalidadZoologico() {
        return localidadZoologico;
    }

    public void setLocalidadZoologico(String localidadZoologico) {
        this.localidadZoologico = localidadZoologico;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public Recinto[] getRecintos() {
        return recintos;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public int getCantidadRecintos() {
        return cantidadRecintos;
    }

    /**
     * Agrega un recinto al zoológico si todavía hay espacio.
     */
    public boolean agregarRecinto(Recinto recinto) {
        if (recinto == null) {
            return false;
        }

        if (cantidadRecintos < recintos.length) {
            recintos[cantidadRecintos] = recinto;
            cantidadRecintos++;
            return true;
        }

        return false;
    }

    /**
     * Registra un animal en el zoológico si no se ha alcanzado la capacidad máxima.
     */
    public String agregarAnimal(Animal animal) {
        if (animal == null) {
            return "Animal inválido.";
        }

        if (cantidadAnimales < animales.length) {
            animales[cantidadAnimales] = animal;
            cantidadAnimales++;
            return "Animal agregado correctamente.";
        }

        return "No hay espacio para más animales.";
    }

    /**
     * Elimina un animal según su identificador y recorre los elementos
     * restantes para evitar espacios vacíos en el arreglo.
     */
    public String eliminarAnimal(int idAnimal) {
        for (int i = 0; i < cantidadAnimales; i++) {
            if (animales[i].getIdAnimal() == idAnimal) {
                for (int j = i; j < cantidadAnimales - 1; j++) {
                    animales[j] = animales[j + 1];
                }

                animales[cantidadAnimales - 1] = null;
                cantidadAnimales--;
                return "Animal eliminado correctamente.";
            }
        }

        return "Animal no encontrado.";
    }

    /**
     * Busca un animal por su identificador.
     */
    public Animal buscarAnimalPorId(int idAnimal) {
        for (int i = 0; i < cantidadAnimales; i++) {
            if (animales[i].getIdAnimal() == idAnimal) {
                return animales[i];
            }
        }
        return null;
    }

    /**
     * Busca un recinto por su identificador.
     */
    public Recinto buscarRecintoPorId(int idRecinto) {
        for (int i = 0; i < cantidadRecintos; i++) {
            if (recintos[i].getIdRecinto() == idRecinto) {
                return recintos[i];
            }
        }
        return null;
    }

    /**
     * Verifica si un recinto ya tiene un animal asignado.
     */
    public boolean recintoOcupado(int idRecinto) {
        for (int i = 0; i < cantidadAnimales; i++) {
            if (animales[i].getIdRecinto() == idRecinto) {
                return true;
            }
        }
        return false;
    }

    /**
     * Asigna un animal a un recinto usando los identificadores de ambos.
     */
    public String asignarAnimal(int idAnimal, int idRecinto) {
        Animal animal = buscarAnimalPorId(idAnimal);
        Recinto recinto = buscarRecintoPorId(idRecinto);

        if (animal == null) {
            return "Animal no encontrado.";
        }

        if (recinto == null) {
            return "Recinto no encontrado.";
        }

        if (animal.getIdRecinto() != -1) {
            return "El animal ya tiene un recinto asignado.";
        }

        if (recintoOcupado(idRecinto)) {
            return "El recinto ya está ocupado.";
        }

        animal.setIdRecinto(idRecinto);
        return "Animal asignado correctamente al recinto " + recinto.getNombreRecinto() + ".";
    }

    /**
     * Cambia un animal de recinto, validando que el nuevo recinto exista
     * y no esté ocupado.
     */
    public String moverAnimal(int idAnimal, int nuevoIdRecinto) {
        Animal animal = buscarAnimalPorId(idAnimal);
        Recinto nuevoRecinto = buscarRecintoPorId(nuevoIdRecinto);

        if (animal == null) {
            return "Animal no encontrado.";
        }

        if (nuevoRecinto == null) {
            return "Recinto no encontrado.";
        }

        if (animal.getIdRecinto() == -1) {
            return "El animal no tiene un recinto asignado.";
        }

        if (animal.getIdRecinto() == nuevoIdRecinto) {
            return "El animal ya se encuentra en ese recinto.";
        }

        if (recintoOcupado(nuevoIdRecinto)) {
            return "El recinto nuevo ya está ocupado.";
        }

        animal.setIdRecinto(nuevoIdRecinto);
        return "Animal movido correctamente al recinto " + nuevoRecinto.getNombreRecinto() + ".";
    }

    /**
     * Busca un animal por su identificador y devuelve su información.
     */
    public String buscarAnimal(int idAnimal) {
        Animal animal = buscarAnimalPorId(idAnimal);

        if (animal != null) {
            return animal.mostrarInfo();
        }

        return "Animal no encontrado.";
    }

    /**
     * Genera un reporte con todos los animales registrados en el zoológico.
     */
    public String reporteAnimales() {
        String reporte = "=== REPORTE DE ANIMALES ===\n";
        reporte += "Zoológico: " + nombreZoologico + "\n";
        reporte += "Localidad: " + localidadZoologico + "\n\n";

        if (cantidadAnimales == 0) {
            return reporte + "No hay animales registrados.";
        }

        for (int i = 0; i < cantidadAnimales; i++) {
            reporte += animales[i].mostrarInfo() + "\n";
        }

        return reporte;
    }
}
