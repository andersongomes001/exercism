EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - bake time.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time

def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time.
    :param number_of_layers: int - the number of layers in the lasagna.
    :return: int - preparation time.
    """
    return PREPARATION_TIME * number_of_layers

def elapsed_time_in_minutes(number_of_layers,elapsed_bake_time):
    """Calculate the elapsed cooking time.
    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.
    """
    return EXPECTED_BAKE_TIME - (bake_time_remaining(elapsed_bake_time) -preparation_time_in_minutes(number_of_layers))
