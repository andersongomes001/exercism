
pub fn is_armstrong_number(num: u32) -> bool {
    if num == 0 {
        return true;
    }
    let numbers: Vec<u32> = num.to_string().chars().map(|x| x.to_digit(10).unwrap()).collect();
    let digits = numbers.len() as u32;
    let mut sum = 0;
    for number in numbers {
        sum = number.pow(digits) + sum;
    }
    //println!("{}", sum);
    return num == sum;
}
