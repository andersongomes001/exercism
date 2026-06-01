pub fn reply(message: &str) -> &str {
    let data = message.trim();

    if data.is_empty() {
        return "Fine. Be that way!";
    }
    let is_question: bool = data.ends_with("?");
    let is_yelling : bool = data.chars().any(|c| c.is_alphabetic()) && data.chars().all(|c| !c.is_lowercase());

    if is_question && is_yelling {
        return  "Calm down, I know what I'm doing!";
    } else if is_question {
        return "Sure.";
    } else if is_yelling  {
        return "Whoa, chill out!";
    }
    "Whatever."
}
