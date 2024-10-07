import chardet
class WordReader:
    @staticmethod
    def read_words_from_file(filename):
        try:
            with open(filename, 'rb') as file:
                raw_data = file.read()
                detected_encoding = chardet.detect(raw_data)['encoding']
            
            with open(filename, 'r', encoding=detected_encoding) as file:
                content = file.read()
                words = content.split()
                return words
        except IOError as e:
            print("Error reading file:", e)
            return None