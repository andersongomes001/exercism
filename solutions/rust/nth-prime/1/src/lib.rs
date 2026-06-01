pub fn nth(n: u32) -> u32 {
    let mut tot = 0;
    let mut number = 1;
    while tot <= n {
        if is_prime(number) {
            tot += 1;
        }
        number += 1;
    }
    return number - 1;
}

pub fn is_prime(n: u32) -> bool {
    if n < 2 {
        return false;
    }
    let mut index = 2;
    while (index * index) <= n {
        if n % index == 0 {
            return false;
        }
        index += 1;
    }
    return true;
}
