# Q4. Write a program in R to find factors of a given numbers

find_factors <- function(number){
  factors <- c()
  for(i in 1:number){
    if((number%%i)==0){
      factors <- c(factors,i)
    }
  }
  return (factors)
}

given_number = 24
factors <- find_factors(given_number)
print(factors)