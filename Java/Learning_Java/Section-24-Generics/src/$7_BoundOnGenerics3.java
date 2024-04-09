// Subtypes


// All: String, Integer, Boolean, Character, Float, Double, Number(All numbers)
class BoundOnGenericsDemoClass3<T> {
}


// Only Strings
class BoundDemo extends BoundOnGenericsDemoClass3<String>{

}


/* ?
   ? This is not allowed.
   ? class BoundDemo extends BoundOnGenericsDemoClass3<T>{ }

   ? We have to do this.
   ? class BoundDemo<T> extends BoundOnGenericsDemoClass3<T>{ }

? */




public class $7_BoundOnGenerics3 {
    BoundDemo b = new BoundDemo(); // Only Strings


}
