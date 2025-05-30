package stack;

public class MainTestStack {
    public static void main(String[] args) {
        System.out.println("=== Prueba con StackArray ===");
        testStack(new StackArray<>(10));

        System.out.println("\n=== Prueba con StackLink ===");
        testStack(new StackLink<>());
    }

    public static void testStack(Stack<Integer> stack) {
        try {
            System.out.println("¿Está vacía?: " + stack.isEmpty());

            stack.push(5);
            stack.push(8);
            stack.push(3);
            stack.push(7);
            System.out.println("Contenido de la pila: " + stack);
            System.out.println("Elemento en el tope: " + stack.top());

            System.out.println("Desapilando...");
            while (!stack.isEmpty()) {
                System.out.println("Elemento eliminado: " + stack.pop());
                System.out.println("Pila ahora: " + stack);
            }

            System.out.println("¿Está vacía ahora?: " + stack.isEmpty());
            stack.pop();
            
        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}
