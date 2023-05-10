import matplotlib.pyplot as plt
from statistics import mean
from statistics import median
import numpy as np

# Open file in read only mode and collect response times in list
file = open('response_times.txt', 'r')
lines = file.readlines()
response_times = []


# We multiply by 1000 to give realistic milliseconds impression
# The curl command generated response times in seconds
for entry in lines:
	time = float(entry) * 1000
	response_times.append(time)



# Plot Histograms
plt.hist(response_times, edgecolor="yellow", color="green", bins=200)
plt.xlabel('Response Time')
plt.ylabel('# of requests')
plt.axvline(mean(response_times), color="red", linestyle='dashed', linewidth=1)

# Calculate Percentile Values
p50 = np.percentile(response_times, 50)
p95 = np.percentile(response_times, 95)
p99 = np.percentile(response_times, 99)


# Log p50 and median to verify that our analysis is correct. p50 and median are always same
print ("50th percentile response time: " + str(p50))
print ("Median response time: " + str(median(response_times)))


# Plot Percentiles
plt.axvline(p50, color="blue", linestyle='dashed', linewidth=2)
plt.axvline(p95, color="orange", linestyle='dashed', linewidth=2)
plt.axvline(p99, color="black", linestyle='dashed', linewidth=2)
plt.show()
