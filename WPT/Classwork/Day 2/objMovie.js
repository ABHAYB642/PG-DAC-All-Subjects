let movie={
        mname:"esd",
        director:"fafsdf",
        cast:{
            hero:["df","fgh","fg"],
            heroine:["dfdf","kljk","ghj"],
            vilan:["jlk","lj","hj"],
            comedian:["jk","lk"]
        },
        DateRelease:"23/23/2023",
        budget:1234545,
        kid:true
}
console.log(movie.mname)
//console.log(JSON.stringify(movie))
console.log(movie)
console.log("total no of cast"+movie.cast.hero.length+movie.cast.heroine.length)