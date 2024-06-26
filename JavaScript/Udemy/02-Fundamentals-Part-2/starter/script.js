







// ? BASIC ARRAY OPERATIONS
{
    // Add elements
    const friends = ['Michael', 'Steven', 'Peter'];
    friends.push('Kunjesh');
    console.log(friends);

    friends.unshift('Aryan');
    console.log(friends);

    // Remove elements
    friends.pop();
    console.log(friends); // ['Aryan', 'Michael', 'Steven', 'Peter']

    friends.shift();
    console.log(friends); // ['Michael', 'Steven', 'Peter']

    // Other
    console.log(friends.indexOf('Steven')); // if element is not present in the array => returns -1 like Steven with S small

    console.log(friends.includes('Peter'));
    // ES6 new method
    // uses strict equility
}

//? OBJECTS
{
    const jonasArray = [
        'Kunjesh',
        'Ramani',
        2037 - 2002,
        'Student',
        ['Aryan', 'Ansh', 'Saurin'],
    ];

    const kunjesh = {
        firstName: 'Kunjesh',
        lastName: 'Ramani',
        age: 2037 - 2002,
        job: 'Student',
        friends: ['Aryan', 'Ansh', 'Saurin'],
    };
}

//? DOT vs BRACKET NOTATION
{
    const kunjesh = {
        firstName: 'Kunjesh',
        lastName: 'Ramani',
        age: 2037 - 2002,
        job: 'Student',
        friends: ['Aryan', 'Ansh', 'Saurin'],
    };

    console.log(kunjesh);
    // When you will log the output, you will find the it is unordered

    // DOT notation and BRACKET notation
    console.log(kunjesh.lastName);
    console.log(kunjesh['lastName']); // must be enclosed in a string OTHERWISE error

    const nameKey = 'Name';
    console.log(kunjesh['first' + nameKey]);
    console.log(kunjesh['last' + nameKey]);
    // You cannot perform above operation with DOT notation
    // In DOT notation, we have to use REAL PROPERTY NAME: lastName

    //console.log(kunjesh.'first'+nameKey);  ERROR

    const interestedIn = prompt(
        'What do you want to know about Kunjesh? Choose between firstName,lastName,job,friends'
    );
    console.log(kunjesh.interestedIn); // undefined bcoz there is no property as interestedIn
    console.log(kunjesh[interestedIn]);
    // If you get an answer that is not in the objecct => undefined

    let interestedIn2 = prompt(
        'What do you want to know about Kunjesh? Choose between firstName,lastName,job,friends'
    );

    while (!kunjesh[interestedIn]) {
        interestedIn2 = prompt(
            'What do you want to know about Kunjesh? Choose between firstName,lastName,job,friends'
        );
    }
    console.log(kunjesh[interestedIn2]);
}

//? Challenge
// Jonas has 3 friends, and his best friend is called Michael
{
    const jonas = {
        name: 'Jonas',
        friend: ['Michael', 'Aryan', 'Ansh'],
    };
    console.log(
        `${jonas.name} has ${jonas.friend.length} friends, and his best friend is called ${jonas.friend[0]}`
    );
}

//? OBJECT METHODS
{
    const kunjesh = {
        firstName: 'Kunjesh',
        lastName: 'Ramani',
        birthYear: 2002,
        job: 'Student',
        friends: ['Aryan', 'Ansh', 'Saurin'],
        hasDriversLicence: true,
        calcAge: function (birthYear) {
            // Creating a function in an object
            return 2037 - birthYear;
        },
    };

    // The above expression and below expression are same
    const calcAge = function (birthYear) {
        return 2037 - birthYear;
    };

    console.log(kunjesh.calcAge(2002));
    console.log(kunjesh['calcAge'](2002));

    // In the above example, we have use 2002 at various place.
    // This violates the DRY principle [it is still added in birthYear column]

    // Instead we can write
    const kunjesh2 = {
        firstName: 'Kunjesh',
        lastName: 'Ramani',
        birthYear: 2002,
        job: 'Student',
        friends: ['Aryan', 'Ansh', 'Saurin'],
        hasDriversLicence: true,
        calcAge: function () {
            // Creating a function in an object
            console.log(this); // 'this' is the method before the . in the function call statement
            return 2037 - this.birthYear; // You can also write kunjesh.birthYear but it still violate DRY principle
        },
    };
    console.log(kunjesh2.calcAge());

    // you can also create 'key' inside the function
    const kunjesh3 = {
        firstName: 'Kunjesh',
        lastName: 'Ramani',
        birthYear: 2002,
        job: 'Student',
        friends: ['Aryan', 'Ansh', 'Saurin'],
        hasDriversLicence: true,
        calcAge: function () {
            // Creating a function in an object
            this.age = 2037 - this.birthYear;
            return this.age; // You can also write kunjesh.birthYear but it still violate DRY principle
        },
    };
    console.log(kunjesh3.calcAge());
    console.log(kunjesh3.age);
}

//? Challenge
{
    // Jonas is a 46-year old teacher, and he has a/no driver's licence
    const challenge = {
        firstName: 'Jonas',
        age: 46,
        job: 'teacher',
        hasDriversLicence: true,
        checkLicence: function () {
            if (this.hasDriversLicence) {
                return 'a';
            } else {
                return 'no';
            }
        },
    };
    console.log(
        `${challenge['firstName']} is a ${challenge.age}- year old ${
            challenge.job
        }, and he has ${challenge.checkLicence()} driver's licence`
    );

    // You can also use Ternary operator
    console.log(
        `${challenge['firstName']} is a ${challenge.age}- year old ${
            challenge.job
        }, and he has ${
            challenge.hasDriversLicence ? 'a' : 'no'
        } driver's licence`
    );
}

//? LOOPS

{
    // FOR loop
    for (let index = 1; index <= 10; index++) {
        console.log(`Lifting weights repitition ${index} 🏋️`);
    }

    //? LOOPING ARRAY - BREAKING AND CONTINUING

    const jonasArray = [
        'Kunjesh',
        'Ramani',
        2037 - 2002,
        'Student',
        ['Aryan', 'Ansh', 'Saurin'],
        true,
    ];

    let type = [];

    for (let i = 0; i < jonasArray.length; i++) {
        console.log(jonasArray[i], typeof jonasArray[i]);
        // type.push(typeof jonasArray[i]);
        type[i] = typeof jonasArray[i];
    }
    console.log(type, typeof type);

    // continue & break
    // BREAK break the whole loop
    // REST = You already know

    //? LOOPING BACKWARDS AND LOOPS IN LOOP

    const jonasArray2 = [
        'Kunjesh',
        'Ramani',
        2037 - 2002,
        'Student',
        ['Aryan', 'Ansh', 'Saurin'],
        true,
    ];

    // 4,3,2,1,0
    for (let i = jonasArray2.length - 1; i >= 0; i--) {
        console.log(jonasArray2[i]);
    }

    for (let i = 1; i <= 5; i++) {
        // Pattern
        let str = '';
        for (let j = 1; j <= i; j++) {
            str += '*';
        }
        console.log(str);
    }

    //? WHILE LOOP

    let rep = 1;
    while (rep <= 10) {
        console.log(`Repitition ${rep}`);
        console.log('Hello World');
        x;
        rep++;
    }

    //? PRACTICE
    const kunjesh2 = {
        firstName: 'Kunjesh',
        lastName: 'Ramani',
        birthYear: 2002,
        job: 'Student',
        friends: ['Aryan', 'Ansh', 'Saurin'],
        hasDriversLicence: true,
        calcAge: function () {
            // Creating a function in an object
            console.log(this); //object, 'this' is the method before the . in the function call statement
            return 2037 - this.birthYear; // You can also write kunjesh.birthYear but it still violate DRY principle
        },
    };
    console.log(kunjesh2.calcAge());

    const kunjesh3 = {
        firstName: 'Kunjesh',
        lastName: 'Ramani',
        birthYear: 2002,
        job: 'Student',
        friends: ['Aryan', 'Ansh', 'Saurin'],
        hasDriversLicence: true,
        calcAge: function () {
            // Creating a function in an object
            this.age = 2037 - this.birthYear;
            return this.age; // You can also write kunjesh.birthYear but it still violate DRY principle
        },
    };
    console.log(kunjesh3.age); // undefined because we have not called the function
    // console.log(kunjesh3.calcAge());
}
