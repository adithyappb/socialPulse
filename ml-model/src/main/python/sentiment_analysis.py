import tensorflow as tf
import numpy as np
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Embedding, LSTM, Dense

# Define the model
model = Sequential([
    Embedding(input_dim=10000, output_dim=64),
    LSTM(64),
    Dense(1, activation='sigmoid')
])

# Compile the model
model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

# Training the model 
X_train = np.random.rand(1000, 100)  
y_train = np.random.randint(0, 2, size=(1000, 1))  

# Save the model
model.fit(X_train, y_train, epochs=5, batch_size=32)
model.save("sentiment_analysis_model.h5")
