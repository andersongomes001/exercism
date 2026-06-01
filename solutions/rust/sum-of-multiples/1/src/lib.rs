pub fn sum_of_multiples(limit: u32, factors: &[u32]) -> u32 {
    let mut sum: u32 = 0;
    let mut multiples: Vec<u32> = Vec::new();
    for factor in factors.iter() {
        let mut index: u32 = 0;
        while index < limit {
            let result = index * factor;
            if result < limit {
                multiples.push(result);
            }else {
                break;
            }
            index += 1;
        }

    }
    multiples.sort();
    multiples.dedup();
    sum += multiples.iter().fold(0, |acc, x| acc + x);
    return sum;
}
