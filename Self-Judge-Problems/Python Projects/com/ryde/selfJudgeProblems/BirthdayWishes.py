storyViewers = int(input("Type the story viewers count > "))
wishes = int(input("Type the wishes he received > "))

result = wishes / storyViewers * 100
print('{:.2f}'.format(result))
