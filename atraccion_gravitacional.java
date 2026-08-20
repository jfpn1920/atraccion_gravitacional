import java.util.Scanner;
public class atraccion_gravitacional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] cuerpos1 = new String[10];
        String[] cuerpos2 = new String[10];
        double[] masas1 = new double[10];
        double[] masas2 = new double[10];
        double[] distancias = new double[10];
        String[] unidadesMasa = new String[10];
        String[] unidadesDistancia = new String[10];
        double[] fuerzas = new double[10];
        String[] tiposCuerpos = new String[10];
        String[] estados = new String[10];
        final double G = 6.67430E-11;
        int total = 0;
        int opcion;
        //-----------------------------------------------//
        //--|menu_principal_de_atraccion_gravitacional|--//
        //-----------------------------------------------//
        do {
            System.out.println("menu principal de atraccion gravitacional");
            System.out.println("1) Registrar calculo");
            System.out.println("2) Editar calculo");
            System.out.println("3) Listar calculos");
            System.out.println("4) Buscar calculo");
            System.out.println("5) Eliminar calculo");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_calculo|--//
                //-----------------------//
                case 1:
                    if (total >= cuerpos1.length) {
                        System.out.println("No hay espacio para registrar mas calculos.");
                        break;
                    }
                    System.out.println("registro de atraccion gravitacional");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("nombre del cuerpo 1: ");
                    cuerpos1[total] = entrada.nextLine();
                    System.out.print("nombre del cuerpo 2: ");
                    cuerpos2[total] = entrada.nextLine();
                    System.out.print("masa del cuerpo 1 en kg: ");
                    masas1[total] = entrada.nextDouble();
                    System.out.print("masa del cuerpo 2 en kg: ");
                    masas2[total] = entrada.nextDouble();
                    System.out.print("distancia entre los cuerpos en metros: ");
                    distancias[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("unidad de masa: ");
                    unidadesMasa[total] = entrada.nextLine();
                    System.out.print("unidad de distancia: ");
                    unidadesDistancia[total] = entrada.nextLine();
                    System.out.print("tipo de cuerpos: ");
                    tiposCuerpos[total] = entrada.nextLine();
                    fuerzas[total] = G * (masas1[total] * masas2[total]) / (distancias[total] * distancias[total]);
                    estados[total] = "Calculado";
                    total++;
                    System.out.println("Calculo realizado correctamente.");
                    break;
                //--------------------//
                //--|editar_calculo|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen calculos registrados.");
                        break;
                    }
                    System.out.println("datos de los calculos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cuerpo 1: " + cuerpos1[i] + " | Cuerpo 2: " + cuerpos2[i] + " | Masa 1: " + masas1[i] + " | Masa 2: " + masas2[i] + " | Distancia: " + distancias[i] + " | Unidad masa: " + unidadesMasa[i] + " | Unidad distancia: " + unidadesDistancia[i] + " | Fuerza: " + fuerzas[i] + " | Tipo: " + tiposCuerpos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del calculo a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar calculo");
                        System.out.print("nuevo cuerpo 1: ");
                        cuerpos1[posicion] = entrada.nextLine();
                        System.out.print("nuevo cuerpo 2: ");
                        cuerpos2[posicion] = entrada.nextLine();
                        System.out.print("nueva masa del cuerpo 1 en kg: ");
                        masas1[posicion] = entrada.nextDouble();
                        System.out.print("nueva masa del cuerpo 2 en kg: ");
                        masas2[posicion] = entrada.nextDouble();
                        System.out.print("nueva distancia en metros: ");
                        distancias[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("nueva unidad de masa: ");
                        unidadesMasa[posicion] = entrada.nextLine();
                        System.out.print("nueva unidad de distancia: ");
                        unidadesDistancia[posicion] = entrada.nextLine();
                        System.out.print("nuevo tipo de cuerpos: ");
                        tiposCuerpos[posicion] = entrada.nextLine();
                        fuerzas[posicion] = G * (masas1[posicion] * masas2[posicion]) / (distancias[posicion] * distancias[posicion]);
                        estados[posicion] = "Revisado";
                        System.out.println("Calculo actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_calculos|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen calculos registrados.");
                    } else {
                        System.out.println("lista de calculos gravitacionales");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Cuerpo 1: " + cuerpos1[i] + " | Cuerpo 2: " + cuerpos2[i] + " | Masa 1: " + masas1[i] + " | Masa 2: " + masas2[i] + " | Distancia: " + distancias[i] + " | Unidad masa: " + unidadesMasa[i] + " | Unidad distancia: " + unidadesDistancia[i] + " | Fuerza: " + fuerzas[i] + " | Tipo: " + tiposCuerpos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_calculo|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen calculos registrados.");
                        break;
                    }
                    System.out.println("busqueda de calculo");
                    System.out.print("Ingrese el ID del calculo a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("calculo encontrado");
                        System.out.println("ID: " + idBusqueda + " | Cuerpo 1: " + cuerpos1[posicion] + " | Cuerpo 2: " + cuerpos2[posicion] + " | Masa 1: " + masas1[posicion] + " | Masa 2: " + masas2[posicion] + " | Distancia: " + distancias[posicion] + " | Unidad masa: " + unidadesMasa[posicion] + " | Unidad distancia: " + unidadesDistancia[posicion] + " | Fuerza: " + fuerzas[posicion] + " | Tipo: " + tiposCuerpos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_calculo|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen calculos registrados.");
                        break;
                    }
                    System.out.println("datos de los calculos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cuerpo 1: " + cuerpos1[i] + " | Cuerpo 2: " + cuerpos2[i] + " | Masa 1: " + masas1[i] + " | Masa 2: " + masas2[i] + " | Distancia: " + distancias[i] + " | Unidad masa: " + unidadesMasa[i] + " | Unidad distancia: " + unidadesDistancia[i] + " | Fuerza: " + fuerzas[i] + " | Tipo: " + tiposCuerpos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del calculo a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            cuerpos1[i] = cuerpos1[i + 1];
                            cuerpos2[i] = cuerpos2[i + 1];
                            masas1[i] = masas1[i + 1];
                            masas2[i] = masas2[i + 1];
                            distancias[i] = distancias[i + 1];
                            unidadesMasa[i] = unidadesMasa[i + 1];
                            unidadesDistancia[i] = unidadesDistancia[i + 1];
                            fuerzas[i] = fuerzas[i + 1];
                            tiposCuerpos[i] = tiposCuerpos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Calculo eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen calculos registrados.");
                        break;
                    }
                    double fuerzaMayor = fuerzas[0];
                    double fuerzaMenor = fuerzas[0];
                    double distanciaTotal = 0;
                    String cuerpoMayor = cuerpos1[0];
                    int calculosRealizados = 0;
                    int calculosPendientes = 0;
                    int calculosRevisados = 0;
                    for (int i = 0; i < total; i++) {
                        distanciaTotal += distancias[i];
                        if (fuerzas[i] > fuerzaMayor) {
                            fuerzaMayor = fuerzas[i];
                            cuerpoMayor = cuerpos1[i];
                        }
                        if (fuerzas[i] < fuerzaMenor) {
                            fuerzaMenor = fuerzas[i];
                        }
                        if (estados[i].equalsIgnoreCase("Calculado")) {
                            calculosRealizados++;
                        } else if (estados[i].equalsIgnoreCase("Pendiente")) {
                            calculosPendientes++;
                        } else if (estados[i].equalsIgnoreCase("Revisado")) {
                            calculosRevisados++;
                        }
                    }
                    double distanciaPromedio = distanciaTotal / total;
                    System.out.println("resumen de atraccion gravitacional");
                    System.out.println("Calculos registrados: " + total);
                    System.out.println("Mayor fuerza gravitacional: " + fuerzaMayor);
                    System.out.println("Menor fuerza gravitacional: " + fuerzaMenor);
                    System.out.println("Cuerpo asociado a la mayor fuerza: " + cuerpoMayor);
                    System.out.println("Distancia promedio: " + distanciaPromedio);
                    System.out.println("Calculos realizados: " + calculosRealizados);
                    System.out.println("Calculos pendientes: " + calculosPendientes);
                    System.out.println("Calculos revisados: " + calculosRevisados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Atraccion Gravitacional.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}