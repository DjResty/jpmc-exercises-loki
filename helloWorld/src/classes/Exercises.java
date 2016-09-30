package classes;

import objects.Animal;
import objects.Customer;
import objects.Employee;
import objects.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.shuffle;

/**
 * Created by nxtlvl on 9/30/2016.
 */
public class Exercises {

    /**
     *  VARIABLES
     *  private variables are only accessible inside the class
     *  data-types
     **/
            public static void variables(){
                byte byteVariable = 127;  // Range from -128 to 127
                short mediumRangeDecimalVariable = 32767; // Range from -32768 to 32767
                int decimalVariableUpTo = 2147483647;
                long largeDecimalVariableFrom = -9223372036854775808L ;
                long largeDecimalVariableUpTo = 9223372036854775807L;
                float numberWithDecimalPlaces = 8.2f;
                double veryLargeNumberWithDecimalPlaces = 12312312.1232;
                boolean isTrueOrFalse = true;
                char singleCharacter = '\u0041'; //min \u0000 max \uffff

                String someText = "this is a string variable";

                System.out.println(byteVariable);
                System.out.println(mediumRangeDecimalVariable);
                System.out.println(decimalVariableUpTo);
                System.out.println(largeDecimalVariableFrom);
                System.out.println(largeDecimalVariableUpTo);
                System.out.println(numberWithDecimalPlaces);
                System.out.println(isTrueOrFalse);
                System.out.println(singleCharacter);
                System.out.println(someText);
            }



    /**
     * ENCAPSULATION
     * binds together the data and functions that manipulate the data
     * keeps both sage from outside interference and misuse
     **/
            public static void encapsulation(){
                Person person = new Person();
                person.setFirstName("Loki");
                String firstName = person.getFirstName();

                System.out.println( firstName );
            }




    /**
     * INHERITANCE
     * enables new objects to take on the properties of existing objects
     * by extending the class to the other one using "extends"
     * e.g.
     * public class Employee extends Person()
     */
            public static void inheritance(){
                Employee employee    = new Employee();

                employee.setFirstName("Restituto");
                employee.setLastName("Loquinario");

                String introduceYourself = employee.introduceYourself();

                System.out.println( introduceYourself );
            }



    /**
     * POLYMORPHISM
     * poly  = many
     * morph = behavior
     * manipulate the behavior/method of an object
     *
     * Method Overloading and Override
     */
            public static void polymorphism(){
                    /**
                     * METHOD OVERLOADING
                     * setting a parameter to a method
                     * calling the parameter/argument of a return function
                     * instead of calling the function
                     */

                            Customer customer = new Customer();
                            customer.setFirstName("Restituto");
                            customer.setLastName("Loquinario II");
                            customer.setCustomer("Regular Customer");
                            String introduceCustomer = customer.introduceYourself();

                            String food = customer.productType("Chicken cury");
                            System.out.println(introduceCustomer + " " + food);


                    /**
                     *  OVERRIDE
                     *  override or overwriting the current store data in a variable
                     *  using @override
                     *  above the
                     *
                     *  @override
                     *  public String getThis(){}
                     *
                     */
            }


    /* TODO create an Animal class with 3 properties  with getters and setters (data types = int, String, and Boolean) */
            public static void homeWOrk() {

                Animal animal = new Animal();

                animal.setAnimalType("Dog");
                animal.setNumberOfAnimals(25);
                animal.setAnimalExtinct(false);

                String animalType = animal.getAnimalType();
                int animalNumbers = animal.getNumberOfAnimals();
                boolean animalExtinct = animal.isAnimalExtinct();

                System.out.println("Animal Type       : " + animalType);
                System.out.println("Number of Animals : " + animalNumbers);
                System.out.println("Extinct           : " + animalExtinct);
            }



    /**
     * CONSTRUCTOR
     * instead of making a setter
     * create a public of the class that has an argument
     * e.g.
     * class Person()
     * constructor
     * public Person(String fistName , String lastName)
     * {
     *      this.firstName = firstName;
     *      this.lastName  = lastName;
     * }
     * storing the data to the variable
     */
            public static void constructor(){
                //Person person = new Person ("Restituto" , "Loquinario");
            }





    /**
     *  ABSTRACT
     *  changing public class into public abstract class
     *  by adding abstract
     *
     *  public class Person()
     *  into
     *  public abstract class Person()
     *
     *  accessing Person class only by inheriting
     *  or extends
     *
     *  public class Test extends Person()
     */





    /**
     * CONDITION
     * using if else statement
     */
            public static void ifElse(){
                    String name = "Restituto";

                    if (name == "Restituto") {
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
            }



    /**
     * LOOPING
     *  -> while
     *  -> do-while
     *  -> for
     */

            /**
             * WHILE
             * the statement is true execute the program
             */
                    public static void whileLoop(){
                        /* Looping - Display the value */
                            int n = 1;
                            while ( n < 7 ) {
                                System.out.print( "[" + n + "]"  );
                                n++;
                            }

                        /*Looping - Adding the value*/
                            int sum = 0;
                            while ( n < 7 ) {
                                sum += n;
                                n++;
                            }
                            System.out.println ( sum ) ;
                    }


            /**
             * DO - WHILE
             * do the program while the statement is true
             */
                    public static void doWhileLoop(){
                        int n = 1;
                        do {
                            System.out.print("[" + n + "]");
                            n++ ;
                        }
                        while ( n > 7 );
                    }

            /**
             * FOR
             * for ( declare ; initialize ; increment/decrement){}
             */
                    public static void forLoop(){
                        int i;
                        int sum = 0;
                        for ( i = 1 ; i <= 6 ; i++){
                            sum += 1;
                        }

                        System.out.println( sum );
                    }


    /**
     * ARRAY
     * informational data or a set of data into one variable
     * String[] myFriends = new String[6];
     * to specify the number of elements in an array
     */
                public static void array(){
                    String[] myInstructor = {"Neil" , "Bert" , "Rad"};
                    for( int i = 0 ; i < 3 ; i++ ){
                        if( myInstructor[i] == "Bert" ){
                            myInstructor[i] = "Amante" ;
                        }

                        System.out.println(myInstructor[i]);
                    }
                }


                public static void friendList(){
                    List<String> friends = new ArrayList<String>();
                    friends.add("Ara");
                    friends.add("Bobby");
                    friends.add("Charlie");
                    friends.add("Dreigh");
                    friends.add("France");

                    System.out.print(friends);
                }

                public static void girlFriendList(){
                    List<String> girlfriend = new ArrayList<String>();
                    girlfriend.add("Aira");
                    girlfriend.add("Barbara");
                    girlfriend.add("Chixy");
                    girlfriend.add("Dexy");
                    girlfriend.add("Farrah");

                    System.out.print(girlfriend);
                }



                /**
                 * ADDING ELEMENTS TO AN ARRAY
                 * using List
                 * to add . use .add(index, value)
                 * Display the element by using .get(index)
                 *
                 * import java.util.List;
                 * import java.util.ArrayList
                 *
                 */
                            public static void arrayAddList(){
                                    List<String> myFriends = new ArrayList<String>();
                                    myFriends.add(0 ,"Neil");
                                    myFriends.add(1 ,"Bert");

                                    /* Use .get(index) for getting the element of an array */
                                    System.out.println(myFriends.get(1));
                            }


                /**
                 * GET NUMBER of ELEMENTS
                 * Display the elements using For loop
                 * get the number of elements using .size()
                 */
                            public static void araryDisplay(){
                                List<String> myGirlFriends = new ArrayList<String>();
                                myGirlFriends.add("Chon");
                                myGirlFriends.add("Mamac");

                                /* Use .size() for getting the number of elements in an array */
                                int numElements = myGirlFriends.size();

                                for (int i = 0 ; i < numElements ; i++  ){
                                    System.out.println( myGirlFriends.get(i) );
                                }
                            }


                /**
                 *  GET RANDOM ELEMENT
                 *  Random get of elements in array
                 *  using Random() and .nextInt(number of elements)
                 *
                 *  import java.util.Random;
                 */
                            public static String pickGirl(){
                                List<String> girl = new ArrayList<String>();
                                girl.add("Chon");
                                girl.add("Raiza");
                                girl.add("Nicole");
                                girl.add("Krestin");
                                girl.add("Jean");

                                int numGirl = girl.size();

                                Random random = new Random();
                                int newGirl = random.nextInt(numGirl);

                                String pickGirl = girl.get(newGirl);

                                return pickGirl;
                            }

                            public static String pickBoy(){
                                List<String> boy  = new ArrayList<String>();
                                Collections.shuffle(boy);
                                boy.add("DJ");
                                boy.add("Genta");
                                boy.add("Loki");
                                boy.add("Resty");
                                boy.add("Toto");

                                int numBoy  = boy.size();

                                Random random = new Random();
                                int newBoy  = random.nextInt(numBoy);

                                String pickBoy = boy.get(newBoy);

                                return pickBoy;
                            }

                            public static String status(){
                                List<String> status = new ArrayList<String>();
                                status.add("Hate");
                                status.add("Love");
                                status.add("Admires");
                                status.add("Has a Crush on");

                                int numStatus = status.size();

                                Random random = new Random();
                                int newStatus = random.nextInt(numStatus);

                                String pickStatus = status.get(newStatus);

                                return pickStatus;
                            }

                            public static void relationGenerate(){
                                System.out.println( pickBoy() + " " + status() + " " + pickGirl() );

                            }

                /**
                 *  SHUFFLE ELEMENTS of an ARRAY
                 *  shuffle the elements of an array and display it
                 *
                 * import java.util.Collections;
                 */

                            public static void shuffleArray(){
                                List<String> person = new ArrayList<String>();
                                person.add("John");
                                person.add("Loki");
                                person.add("Daniel");
                                person.add("Resty");
                                person.add("Dj");
                                Collections.shuffle(person);

                                List<String> action = new ArrayList<String>();
                                action.add("buy a");
                                action.add("ride in the ");
                                action.add("eat a");
                                action.add("hide in the");
                                action.add("sleep in a");
                                Collections.shuffle(action);

                                List<String> gadget = new ArrayList<String>();
                                gadget.add("car");
                                gadget.add("bag");
                                gadget.add("laptop");
                                gadget.add("table");
                                gadget.add("bike");
                                Collections.shuffle(gadget);

                                int numPerson = person.size();

                                for( int i = 0 ; i < numPerson ; i++ ){
                                    System.out.println(person.get(i) + " " + action.get(i) + " " + gadget.get(i));
                                }


                            }
    }
