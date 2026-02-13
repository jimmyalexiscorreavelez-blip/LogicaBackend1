package coustomersystem;

import java.util.Scanner;

public class SellingSystem {
    static Scanner sc = new Scanner(System.in);
    // Product Atributes

    static int id;
    static String description;
    static double price;
    static int quantity;
    static boolean state;

    // Customer Atributes

    static int customerId;
    static String name;
    static String lastName;
    static String address;
    static String phone;
    static String email;


    public static void main(String[] args) {
        createProducts();
        getProducts();

        System.out.println("Ingrese el id del producto a actualizar");
        int id = sc.nextInt();
        sc.nextLine();
        updateProducts(id);

        System.out.println("Ingrese el dato a eliminar");
        int deleteId = sc.nextInt();
        sc.nextLine();
        deleteProducts(id);

        //Clientes

        createCustomer();
        getCustomer();

        System.out.println("Ingrese el id del cliente a actualizar");
        int customerFindId = sc.nextInt();
        sc.nextLine();
        updateCustomer(customerFindId);

        System.out.println("Ingrese el id del cliente para eliminar");
        int customerDeleteId = sc.nextInt();
        sc.nextLine();
        deleteCustomer(customerDeleteId);
    }

    // Class Methods

    public static void createProducts() {

        System.out.println("Ingrese el id del producto");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la descripcion del producto");
        description = sc.nextLine();

        System.out.println("Ingrese el precio del producto");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese la cantidad");
        quantity = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el estado del producto");
        state = sc.nextBoolean();
    }

    public static void getProducts() {
        System.out.println("Id: " + id + "\n" +
                "Description: " + description + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "State: " + state + "\n");
    }

    public static void updateProducts(int findId) {

        if (findId == id) {
            System.out.println("Ingrese el id del producto");
            id = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese la descripcion del producto");
            description = sc.nextLine();

            System.out.println("Ingrese el precio del producto");
            price = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese la cantidad");
            quantity = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el estado del producto");
            state = sc.nextBoolean();
        } else {
            System.out.println("No se encontro el producto");
        }


    }

    public static void deleteProducts(int deleteId) {

        if (deleteId == id) {
            id = 0;

            description = " ";

            price = 0.0;

            quantity = 0;

            state = false;
        } else {
            System.out.println("Id: " + id + "no encontrado");
        }


    }
    public static void createCustomer(){
        System.out.println("Ingrese el id del cliente");
        customerId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre");
        name= sc.nextLine();

        System.out.println("Ingrese el apellido");
        lastName= sc.nextLine();

        System.out.println("ingresa la direcion");
        address= sc.nextLine();

        System.out.println("Ingres el telefono");
        phone= sc.nextLine();

        System.out.println("Ingresa el correo electronico ");
        email= sc.nextLine();
    }
    public static void getCustomer(){
        System.out.println(
                "Id: " + customerId + "\n" +
                        "Nombre: " + name + "\n" +
                        "Apellido: " + lastName + "\n" +
                        "Direccion: " + address + "\n" +
                        "Telefono: " + phone + "\n" +
                        "Correo: " + email + "\n"
                                 );
    }
    public static void updateCustomer(int findId){
        if (findId == customerId){
            System.out.println("Ingrea el id del cliente");
            customerId = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el nombre");
            name = sc.nextLine();

            System.out.println("Ingresa el apellido");
            lastName = sc.nextLine();

            System.out.println("Ingrese la direccion");
            address = sc.nextLine();

            System.out.println("Ingrese el telefono");
            phone = sc.nextLine();

            System.out.println("Ingrese el correo");
            email = sc.nextLine();
        }else{
            System.out.println("el cliente no se ah encontrado");
        }
    }

    public static void deleteCustomer(int deleteId){
        if (deleteId == customerId){
            customerId = 0;
            name= "";
            lastName= "";
            address = "";
            phone= "";
            email="";

            System.out.println("El cliente a sido eliminado correctamente");
        }else{
            System.out.println("EL cliente no se encontro ");
        }
    }
















}
