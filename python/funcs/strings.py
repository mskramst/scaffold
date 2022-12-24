
def hello_name(name):
    return "Hello " + name

def make_abba(str1, str2):
    return str1 + str2 + str2 + str1;

def make_tags(str1, str2):
    return "<" + str1 + ">"+ str2 + "</" + str1 + ">"

def make_out_word(out, word):
    return out[:2] + word + out[-2:]

def count_substrings(s,subs):
    return s.count(subs)

def count_substrings_long(s,sub):
    count = 0
    for i in range(len(s)-1):
        if (s[i:i+len(sub)] == sub):
            count+=1
    return count

def surround_shorter(s1, s2):
    if (len(s1) > len(s2)):
        return s1+" "+s2+" "+s1
    else:
        return s2+" "+s1+" "+s2

def surround_longer(s1, s2):
    if (len(s1) < len(s2)):
        return '{} {} {}'.format(s1, s2, s1)
    else:
        return '{} {} {}'.format(s2, s1, s2)

