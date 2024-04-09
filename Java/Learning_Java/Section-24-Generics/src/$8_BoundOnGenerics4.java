// Bounded Types

// Only Numbers (Integer, Float, Double)
// This "extends" works for class & interfaces.
class BoundOnGenericsDemoClass4<T extends Number> { }


/////////////////////////////////////////////////////////////////////////////////////
class A{}
class B extends A{}
class C extends A{}

//? Allowed
// <T extends A>
// <T extends B>
// <T extends C>


interface A2 {}
class B2 implements A2{}
class C2 implements A2{}

//? Allowed
// <T extends A2>
// <T extends B2>
// <T extends C2>

/////////////////////////////////////////////////////////////////////////////////////





public class $8_BoundOnGenerics4 {
}
