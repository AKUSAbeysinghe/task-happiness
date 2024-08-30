package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
//@ComponentScan (basePackages = "com.amigoscode")
//@EnableAutoConfiguration
//@Configuration
@RestController
@RequestMapping("api/v1/customers/1")

public class Main {


    private final CustomerRepository customerRepository;

//    @org.jetbrains.annotations.Contract(pure = true)
   public Main(CustomerRepository customerRepository) {
       this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        SpringApplication.run(Main.class, args );
    }

   // @GetMapping("/greet")
    /*public  String greet(){
        return "Hello";
    }*/

//    public  GreetResponse greet(){
//        GreetResponse response  = new GreetResponse("Hello",
//                List.of("Java", "Golang", "Javascript"),
//                new Person("Alex" , 28, 30_000));
//        return response;
//    }
//
//    record Person(String name, int age, double savings ){
//
//    }
//
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person){}


//    class GreetResponse{
//        private final String greet;
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{"+
//                    "greet='"+greet+'\''+
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hashCode(greet);
//        }
   // }



@GetMapping
public List<Customer> getCustomer(){
    //return List.of();
    return customerRepository.findAll();
}

record NewCustomerRequest(String name,
                          String email,
                          Integer age){


}
@PostMapping
public void addCustomer(@RequestBody NewCustomerRequest request){
   Customer customer = new Customer();
   customer.setName(request.name());
   customer.setAge(Integer.valueOf(request.email()));
   customer.setAge(request.age());
   customerRepository.save(customer);

}

@DeleteMapping("{customerId}")
public void deleteCustomer(@PathVariable("customerId")Integer id){
    customerRepository.deleteById(id);
}

}
