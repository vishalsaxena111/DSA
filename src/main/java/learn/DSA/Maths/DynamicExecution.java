package learn.DSA.Maths;


import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class DynamicExecution {



    public static void main(String[] args) {
        String sourceCode = """
                public class HelloWorld {
                    public static void main(String[] args) {
                        System.out.println("Hello from dynamically compiled code!");
                    }
                }
                """;

        // Write the source code to a file
        try (var writer = new java.io.FileWriter("HelloWorld.java")) {
            writer.write(sourceCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Compile the source file
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, "HelloWorld.java");

        // Run the compiled code
        try {
            Process process = Runtime.getRuntime().exec("java HelloWorld");
            process.getInputStream().transferTo(System.out);  // Output the result
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


