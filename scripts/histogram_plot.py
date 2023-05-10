import matplotlib.pyplot as plt
from statistics import mean

# Open file in read only mode and collect response times in list
file = open('response_times.txt', 'r')
lines = file.readlines()
response_times = []

for entry in lines:
	time = float(entry) * 1000
	response_times.append(time)


plt.hist(response_times, edgecolor="yellow", color="green", bins=200)
plt.xlabel('Response Time')
plt.ylabel('# of requests')
plt.axvline(mean(response_times), color="red", linestyle='dashed', linewidth=1)

plt.show()
