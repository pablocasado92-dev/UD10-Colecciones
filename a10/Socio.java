package a10;

public class Socio implements Comparable<Socio> {
    private String dni;
    private String nombre;

    public Socio(String dni, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // GETS

    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    @Override
    public int compareTo(Socio otro) {
        return this.dni.compareTo(otro.dni);
    }

    @Override
    public boolean equals(Object obj) {
        boolean igual;
        if (this == obj)
            igual= true;
        if (obj == null || getClass() != obj.getClass())
            igual= false;
        Socio otro = (Socio) obj;
        igual =this.dni.equals(otro.dni);
        return igual;
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public String toString() {
        return "[" + this.dni + ", " + this.nombre + "]";
    }

}
