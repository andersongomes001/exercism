pub fn collatz(n: u64) -> Option<u64> {
    let mut total = 0;
    if n == 1 {
        return Option::Some(total);
    }else if n <= 0 {
        return Option::None;
    }
    let mut  calc = n;
    while calc > 1 {
        if calc % 2 == 0 {
            calc = calc / 2;
            total += 1;
        } else {
            calc = (calc * 3) + 1;
            total += 1;
        }
    }
    return Option::Some(total);
}
