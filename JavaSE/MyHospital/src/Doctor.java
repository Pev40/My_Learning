public class Doctor {

    private int id;
    private String name;
    private String especialidad;
    private int turno;
    private boolean disponibilidad;
    private int sede;

    public String nombreSede = obtenerSede();
/**
 * CONSTRUCTORES
 * */
    Doctor(){
        name = "NO DEFINIDO";
        especialidad = "NO DEFINIDO";
        turno = 0;
        setDisponibilidad(false);
        setSede(0);
    }
    Doctor(String name,String especialidad,int turno,boolean disponibilidad,int sede){
        setName(name);
        setEspecialidad(especialidad);
        setTurno(turno);
        setDisponibilidad(disponibilidad);
        setSede(sede);
    }

/**
 * Obtener datos interno
 * */
    public int getSede() {
        return sede;
    }

    public int getId() {
        return id;
    }

    public int getTurno() {
        return turno;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getName() {
        return name;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Setear datos interno
     * */


    public void setSede(int sede) {
        this.sede = sede;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Vistas de los datos
     * */
    public void showDisponibilidad(boolean disponible){
        if (disponible == true) {
            System.out.printf("SI ESTA DISPONIBLE \n");
        }else {
            System.out.printf("NO ESTA DISPONIBLE \n");
        }
    }
    private String obtenerSede(){
        switch (this.sede){
            case 1:
                return "SEDE BERLIN";
            case 2:
                return "SEDE BARCELONA";
            case 3:
                return "SEDE LONDRES";
            case 4:
                return "SEDE BOCA CHICA";
            default:
                return "SEDE NO DEFINIDA";
        }
    }
    public void showName(){
        System.out.println(name);
    }

    public void showDoctor(){
        System.out.printf("Nombre: "+name+"\n");
        System.out.printf("Especialidad: "+especialidad+"\n");
        switch (turno){
            case 1:
                System.out.printf("Turno Mañana \n");
                break;
            case 2:
                System.out.printf("Turno Tarde \n");
                break;
            case 3:
                System.out.printf("Turno Noche \n");
                break;
            default:
                System.out.printf("NO TIENE TURNOS ASIGNADOS \n");
        }
        showDisponibilidad(disponibilidad);
        System.out.println("SEDE: "+this.nombreSede);
    }


}
