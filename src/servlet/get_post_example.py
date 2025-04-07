import requests

# 模拟的 API 地址
url = 'https://httpbin.org'

# 发送 GET 请求
print("发送 GET 请求...")
# 定义 GET 请求的参数
params = {
    'name': 'John',
    'age': 25
}
# 发送 GET 请求并获取响应
get_response = requests.get(url + '/get', params=params)
# 打印 GET 请求的 URL
print("GET 请求的 URL:", get_response.url)
# 打印 GET 请求的响应内容
print("GET 请求的响应内容:", get_response.json())

# 发送 POST 请求
print("\n发送 POST 请求...")
# 定义 POST 请求的数据
data = {
    'name': 'Jane',
    'age': 30
}
# 发送 POST 请求并获取响应
post_response = requests.post(url + '/post', data=data)
# 打印 POST 请求的 URL
print("POST 请求的 URL:", post_response.url)
# 打印 POST 请求的响应内容
print("POST 请求的响应内容:", post_response.json())