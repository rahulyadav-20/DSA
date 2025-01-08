import pandas as pd


# Create a DataFrame
data = {
    'Name': ['John', 'Anna', 'Peter', 'Linda'],
    'Age': [28, 24, 35, 32],
    'City': ['New York', 'Paris', 'Berlin', 'London']
}
df = pd.DataFrame(data)
print("DataFrame:\n", df)

# Read a CSV file
# df = pd.read_csv('file.csv')

# Write a DataFrame to a CSV file
# df.to_csv('file.csv', index=False)

# Display the first few rows of the DataFrame
print("\nHead:\n", df.head())

# Display the last few rows of the DataFrame
print("\nTail:\n", df.tail())

# Get the number of rows and columns
print("\nShape:", df.shape)

# Get basic information about the DataFrame
print("\nInfo:")
df.info()

# Get summary statistics
print("\nDescribe:\n", df.describe())

# Select a single column
print("\nSelect a single column:\n", df['Name'])

# Select multiple columns
print("\nSelect multiple columns:\n", df[['Name', 'Age']])

# Filter rows based on a condition
print("\nFilter rows:\n", df[df['Age'] > 30])

# Add a new column
df['Country'] = ['USA', 'France', 'Germany', 'UK']
print("\nAdd a new column:\n", df)

# Remove a column
df.drop('Country', axis=1, inplace=True)
print("\nRemove a column:\n", df)

# Rename columns
df.rename(columns={'Name': 'First Name', 'Age': 'Years'}, inplace=True)
print("\nRename columns:\n", df)

# Group by a column and get the mean
print("\nGroup by and mean:\n", df.groupby('City').mean())

# Merge two DataFrames
data = {
    'Name': ['John', 'Anna', 'Peter', 'Linda'],
    'Age': [28, 24, 35, 32],
    'City': ['New York', 'Paris', 'Berlin', 'London']
}

data2 = {
    'City': ['New York', 'Paris', 'Berlin', 'London'],
    'Population': [8000000, 2141000, 3769000, 8900000]
}
df2 = pd.DataFrame(data2)
merged_df = pd.merge(df, df2, on='City')
print("\nMerged DataFrame:\n", merged_df)

# Perform an inner join
inner_join_df = pd.merge(df, df2, on='City', how='inner')
print("\nInner Join:\n", inner_join_df)

# Perform a left join
left_join_df = pd.merge(df, df2, on='City', how='left')
print("\nLeft Join:\n", left_join_df)

# Perform a right join
right_join_df = pd.merge(df, df2, on='City', how='right')
print("\nRight Join:\n", right_join_df)

# Perform an outer join
outer_join_df = pd.merge(df, df2, on='City', how='outer')
print("\nOuter Join:\n", outer_join_df)

# Perform a join with different column names
data3 = {
    'CityName': ['New York', 'Paris', 'Berlin', 'London'],
    'Population': [8000000, 2141000, 3769000, 8900000]
}
df3=pd.DataFrame(data3)
# Perform an inner join with different column names
inner_join_diff_col_df = pd.merge(df, df3, left_on='City', right_on='CityName', how='inner')
print("\nInner Join with different column names:\n", inner_join_diff_col_df)

# Perform a left join with different column names
left_join_diff_col_df = pd.merge(df, df3, left_on='City', right_on='CityName', how='left')
print("\nLeft Join with different column names:\n", left_join_diff_col_df)

# Perform a right join with different column names
right_join_diff_col_df = pd.merge(df, df3, left_on='City', right_on='CityName', how='right')
print("\nRight Join with different column names:\n", right_join_diff_col_df)

# Perform an outer join with different column names
outer_join_diff_col_df = pd.merge(df, df3, left_on='City', right_on='CityName', how='outer')
print("\nOuter Join with different column names:\n", outer_join_diff_col_df)


def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    # Perform a left join and filter customers with no orders
    filter_df = customers[~customers['id'].isin(orders['customerId'])]
    filter_df = filter_df.rename(columns={'name': 'Customers'})
    
    return filter_df[['Customers']]
    