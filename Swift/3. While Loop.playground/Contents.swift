// Example: while loops

var product = 3

while (product <= 100)
{
    product *= 3 // after the first iteration - 9, second iteration - 27, in the 3rd 81, in 4th 243
} // end while loop

print(product)




// Fibonacci Series
// 0,1,1,2,3,5,8...

var num1 = 0;
var num2 = 1;
var num3 = 0;
print(num1);
print(num2)
for _ in stride(from: 3, through: 11, by: 1){
    num3 = num1 + num2;
    num1 = num2;
    num2 = num3;
    
    print(num3)
}

