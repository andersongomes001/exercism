/**
 * This stub is provided to make it straightforward to get started.
 */

export function twoFer(person_name?: any): string {
  if (person_name?.length > 0) {
    return `One for ${person_name}, one for me.`;
  } else {
    return "One for you, one for me.";
  }
}
