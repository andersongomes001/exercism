pub fn verse(n: u32) -> String {
    if n > 0 {
        let bottle : &str = if n > 1 { "bottles" } else { "bottle" };
        let mut next_bottle : &str = if (n - 1) >= 2  { "bottles" } else { "bottle" };
        let next_index : String = if n > 1 { (n-1).to_string() } else { "no more".to_string() };
        if next_index == "no more"{
            next_bottle = "bottles";
        }
        let take : &str = if n == 1  { "Take it" } else { "Take one" };
        return format!("{n} {bottle} of beer on the wall, {n} {bottle} of beer.\n{take} down and pass it around, {next_index} {next_bottle} of beer on the wall.");
    }
    "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.".to_string()
}

pub fn sing(start: u32, end: u32) -> String {
    let mut ret = String::new();
    for n in (end..=start).rev() {
        ret.push_str(&verse(n));
        ret.push('\n');
        ret.push('\n');
    };
    ret
}
