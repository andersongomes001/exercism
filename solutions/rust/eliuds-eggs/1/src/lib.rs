pub fn egg_count(display_value: u32) -> usize {
    return format!("{:b}",display_value).replace("0","").len();
}
