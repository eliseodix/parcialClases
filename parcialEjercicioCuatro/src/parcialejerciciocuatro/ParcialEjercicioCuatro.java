package parcialejerciciocuatro;

import javax.swing.*;
import java.util.ArrayList;

public class ParcialEjercicioCuatro {

    private static ArrayList<Sucursal> sucursales = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] opciones = {"REGISTRAR PERSONA", "REGISTRAR ORGANIZACIÓN", "REGISTRAR SUCURSAL", "EMPLEADO", "SALIR"};
            int seleccion = JOptionPane.showOptionDialog(null, "SELECCIONE UNA OPCIÓN", "BANCO: REGISTRO INFORMACIÓN",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (seleccion) {
                case 0:
                    mensajePersona();
                    break;
                case 1:
                    mensajeOrganizacional();
                    break;
                case 2:
                    mensajeSucursal();
                    break;
                case 3:
                    mensajeEmpleado();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "SALIENDO DEL PROGRAMA");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "OPCIÓN NO VÁLIDA, INTENTE DE NUEVO");
            }
        }
    }

    public static void mensajeOrganizacional() {
        String[] tiposDeCuenta = {"Cuenta Corriente", "Cuenta de Ahorro"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione el tipo de cuenta",
                "Tipo de Cuenta",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                tiposDeCuenta,
                tiposDeCuenta[0]
        );
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(null, "NO HA ELEGIDO EL TIPO DE CUENTA");
            return;
        }
   
        String tipoOrganizacion = JOptionPane.showInputDialog("CUAL ES SU TIPO DE ORGANIZACIÓN");
        String representante = JOptionPane.showInputDialog("INGRESE REPRESENTANTE");
        int cantidadEmpleado = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE EMPLEADOS"));
        String codigoIdentificacion = JOptionPane.showInputDialog("INGRESE SU CÉDULA");
        String nombre = JOptionPane.showInputDialog("INGRESE SU NOMBRE");
        String direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCIÓN");

         Organizacion organizacion = new Organizacion(tipoOrganizacion, representante, cantidadEmpleado, codigoIdentificacion, nombre, direccion);

        JOptionPane.showMessageDialog(null, "TIPO DE ORGANIZACIÓN=" + organizacion.getTipoOrganizacion() +
                "\nREPRESENTANTE=" + organizacion.getRepresentante() +
                "\nCANTIDAD DE EMPLEADOS=" + organizacion.getCantidadEmpleados() +
                "\nIDENTIFICACIÓN=" + organizacion.getCodigoIdentificacion() +
                "\nNOMBRE=" + organizacion.getNombre() +
                "\nDIRECCIÓN=" + organizacion.getDireccion() +
                "\nTIPO DE CUENTA=" + tiposDeCuenta[seleccion]);
    }

    public static void mensajePersona() {
        
        String[] tiposDeCuenta = {"Cuenta Corriente", "Cuenta de Ahorro"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione el tipo de cuenta",
                "Tipo de Cuenta",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                tiposDeCuenta,
                tiposDeCuenta[1]
        );

        if (seleccion == -1) {
            JOptionPane.showMessageDialog(null, "NO HA ELEGIDO EL TIPO DE CUENTA");
            return;
        }

        String fechaNacimiento = JOptionPane.showInputDialog("INGRESE FECHA DE NACIMIENTO USAR - PARA SEPARAR");
        String sexo = JOptionPane.showInputDialog("INGRESE EL GÉNERO M/F");
        String codigoIdentificacion = JOptionPane.showInputDialog("INGRESE SU CÉDULA");
        String nombre = JOptionPane.showInputDialog("INGRESE SU NOMBRE");
        String direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCIÓN");

        PersonaFisica persona = new PersonaFisica(fechaNacimiento, sexo, codigoIdentificacion, nombre, direccion);

        JOptionPane.showMessageDialog(null, "FECHA DE NACIMIENTO=" + persona.getFechaNacimineto() +
                "\nSEXO=" + persona.getSexo() +
                "\nIDENTIFICACIÓN=" + persona.getCodigoIdentificacion() +
                "\nNOMBRE=" + persona.getNombre() +
                "\nDIRECCIÓN=" + persona.getDireccion() +
                "\nTIPO DE CUENTA=" + tiposDeCuenta[seleccion]);
    }

    public static void mensajeSucursal() {
        String numeroTelefono = JOptionPane.showInputDialog("INGRESE EL NÚMERO TELEFÓNICO DE LA SUCURSAL");
        String direccion = JOptionPane.showInputDialog("INGRESE LA DIRECCIÓN DE LA SUCURSAL");
        String codigoPostal = JOptionPane.showInputDialog("INGRESE EL CÓDIGO POSTAL DE LA SUCURSAL");
        String ciudad = JOptionPane.showInputDialog("INGRESE LA CIUDAD DE LA SUCURSAL");

        Sucursal sucursal = new Sucursal(numeroTelefono, direccion, codigoPostal, ciudad);
        sucursales.add(sucursal);

        JOptionPane.showMessageDialog(null, "SUCURSAL REGISTRADA:\n" + sucursal);
    }

    public static void mensajeEmpleado() {
        if (sucursales.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY SUCURSALES DISPONIBLES PARA ASIGNAR EMPLEADOS");
            return;
        }

        String[] sucursalOpciones = new String[sucursales.size()];
        for (int i = 0; i < sucursales.size(); i++) {
            sucursalOpciones[i] = sucursales.get(i).getCiudad() + " - " + sucursales.get(i).getDireccion();
        }

        int seleccion = JOptionPane.showOptionDialog(null, "SELECCIONE UNA SUCURSAL", "ASIGNAR EMPLEADO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, sucursalOpciones, sucursalOpciones[0]);

        if (seleccion == -1) {
            JOptionPane.showMessageDialog(null, "NO SELECCIONÓ UNA SUCURSAL");
            return;
        }

        String dni = JOptionPane.showInputDialog("INGREfSE EL DNI DEL EMPLEADO");
        String fechaNacimiento = JOptionPane.showInputDialog("INGRESE LA FECHA DE NACIMIENTO DEL EMPLEADO (AAAA-MM-DD)");
        String sexo = JOptionPane.showInputDialog("INGRESE EL GÉNERO DEL EMPLEADO");
        String nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL EMPLEADO");
        String direccion = JOptionPane.showInputDialog("INGRESE LA DIRECCIÓN DEL EMPLEADO");

        Empleado empleado = new Empleado(dni, fechaNacimiento, sexo, nombre, direccion);
        sucursales.get(seleccion).agregarEmpleado(empleado);

        JOptionPane.showMessageDialog(null, "EMPLEADO REGISTRADO:\n" + empleado +
                "\nASIGNADO A LA SUCURSAL:\n" + "\nSUCURSALfiu"+sucursales.get(seleccion));
    }
}


        
        
    
    
        
       
        
    

