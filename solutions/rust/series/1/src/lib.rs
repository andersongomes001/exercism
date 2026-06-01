pub fn series(digits: &str, len: usize) -> Vec<String> {
    let mut index = 0;
    let mut new_list: Vec<String> = Vec::new();
    while (index + len) <= digits.len() {
        let sublist : Vec<_> = digits.chars().collect();
        let part : String = sublist[index..index+len].iter().collect();
        new_list.push(part);
        index += 1;
    }
    return new_list;
}
