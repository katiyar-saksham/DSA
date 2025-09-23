import string


def remove_punctuation(input_string):
    return input_string.translate(str.maketrans("", "", string.punctuation))

s = input("Enter the string: ")
result = remove_punctuation(s)
print(result)
