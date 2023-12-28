def counting_minutes(input_str):
    input_str = input_str.strip('\"')

    start_time, end_time = map(str.strip, input_str.split('-'))

    start_hour, start_minute = map(int, start_time[:-4].split(':'))
    end_hour, end_minute = map(int, end_time[:-4].split(':'))

    if 'pm' in start_time and start_hour != 12:
        start_hour += 12
    if 'pm' in end_time and end_hour != 12:
        end_hour += 12

    total_minutes = (end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)

    if total_minutes < 0:
        total_minutes += 1440

    return total_minutes

# Take user input
user_input = input()
result = counting_minutes(user_input)

print(f"Output: {result} minutes")
