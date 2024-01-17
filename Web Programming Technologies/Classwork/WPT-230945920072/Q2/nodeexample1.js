let shape = {
    shapename: "Square",
    shapecolor: "Red",
    shapearea: 36
  };
  
  let copyShape = { ...shape }; 
  copyShape.shapecolor = "Green"; 
  
  console.log("Original Shape:");
  console.log(shape);
  console.log("Copy Shape:");
  console.log(copyShape);
  
  
  
  