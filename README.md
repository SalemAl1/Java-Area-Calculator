# Total Area Application

- Welcome to the Total Area Application. This application takes a input line like:  
`java App [size] [shape1] [value1] [shape2] [value2] [sizeth shape] [sizeth value]`  
Then outputs the total area of the shapes the user inputs.
- The input happens in CMD.

## Application Structure

- `App.java`: Class in which the main method are.
- `Drawable.java`: Class to make an array for each element contains `String shape` and `double value`.
- `Shape.java`: The backbone of the Application. The next Classes inheritance from it.
- `Circle.java`: Class Circle inheritances from `Shape.java`. It is called when the user input circle shape to calculate specific things.
- `ThreeDShape`: A Class to repreasent 3D shape, in this case is cube.
- `Cube.java`: Class Circle inheritances from `ThreeDShape.java`. It is called when the user input cube shape to calculate specific things.

## Important Notes
- The other versions is provided 
[here](https://drive.google.com/drive/folders/1_znluESHfB7sUUFvjZ8FWRFQJ2jNuG0N?usp=sharing).
