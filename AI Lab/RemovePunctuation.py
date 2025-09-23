import string


def remove_punctuation(input_string):
    return input_string.translate(str.maketrans("", "", string.punctuation))
