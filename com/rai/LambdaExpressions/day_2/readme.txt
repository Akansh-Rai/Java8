****  Lambdas  ****
 > A concise representation of an anonymous function that can be passed around.
 
 > It doesn’t have a name, but it has a list of parameters, a body, a
   return type, and also possibly a list of exceptions that can be thrown.
   
   
That’s one big definition, let’s break it down,
   
  > Anonymous - We say anonymous because it doesn’t have an explicit name like a method would
                normally have: less to write and think about!
  > Function - We say function because a lambda isn’t associated with a particular class like a method is.
               But like a method, a lambda has a list of parameters, a body, a return type, and a possible list of
               exceptions that can be thrown.
  > Passed around - A lambda expression can be passed as argument to a method or stored in a variable.
  > Concise - You don’t need to write a lot of boilerplate like you do for anonymous classes.
  
  Before:
    Comparator<Apple> byWeight = new Comparator<Apple>() {
         public int compare(Apple a1, Apple a2){
           return a1.getWeight().compareTo(a2.getWeight());
         }
    };
    
   After (with lambda expressions):
   
   Comparator<Apple> byWeight = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
   
 A Lambda expression is composed of
 1. List of Parameters
 2. An Arrow
 3. the body of lambda
 
 
  *** Use case  ***                ***  Examples of lambdas ***
  1. A boolean expression          (List<String> list) -> list.isEmpty()
  2. Creating objects              () -> new Apple(10)
  3. Consuming from an object      (Apple a) -> {
                                          System.out.println(a.getWeight());
                                    }
                                    
  4. Select/extract from an object  (String s) -> s.length()
  
  5. Combine two values              (int a, int b) -> a * b
  
  6.Compare two objects               (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight())
  
  
  
  *** Functional interface ***
  a functional interface is an interface that specifies exactly one abstract method.
  
  Runnable r1 = ()-> System.out.println("Thread is running me.");
  
  *** Function descriptor ***
  The signature of the abstract method of the functional interface is called functional descriptor.
  
  
  Functional interface           Function descriptor          Primitive specializations
    Predicate<T>                   T -> boolean              IntPredicate, LongPredicate, DoublePredicate
    Consumer<T>                    T -> void                 IntConsumer, LongConsumer, DoubleConsumer
	Function<T, R>                 T -> R                    IntFunction<R>, IntToDoubleFunction, IntToLongFunction,
	                                                         LongFunction<R>, LongToDoubleFunction,	LongToIntFunction, DoubleFunction<R>, ToIntFunction<T>,
	                                                         ToDoubleFunction<T>, ToLongFunction<T>
	Supplier<T>                   () -> T                    BooleanSupplier, IntSupplier, LongSupplier, DoubleSupplier
	UnaryOperator<T>              T -> T                     IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator
	BinaryOperator<T>             (T, T) -> T                IntBinaryOperator, LongBinaryOperator, DoubleBinaryOperator
	BiPredicate<L, R>             (L, R) ->	boolean     	
	BiConsumer<T, U>              (T, U) -> void              ObjIntConsumer<T>, ObjLongConsumer<T>,    ObjDoubleConsumer<T>	
	BiFunction<T, U, R>           (T, U) -> R                     ToIntBiFunction<T, U>, ToLongBiFunction<T, U>,
	                                                             ToDoubleBiFunction<T, U>
  
  
  